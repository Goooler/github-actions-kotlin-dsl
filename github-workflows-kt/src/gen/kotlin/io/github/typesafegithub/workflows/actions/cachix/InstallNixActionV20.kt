// This file was generated using action-binding-generator. Don't change it by hand, otherwise your
// changes will be overwritten with the next binding code regeneration.
// See https://github.com/typesafegithub/github-workflows-kt for more info.
@file:Suppress(
    "DataClassPrivateConstructor",
    "UNUSED_PARAMETER",
    "DEPRECATION",
)

package io.github.typesafegithub.workflows.actions.cachix

import io.github.typesafegithub.workflows.domain.actions.Action
import io.github.typesafegithub.workflows.domain.actions.RegularAction
import java.util.LinkedHashMap
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.toList
import kotlin.collections.toTypedArray

/**
 * Action: Install Nix
 *
 * Installs Nix on GitHub Actions for the supported platforms: Linux and macOS.
 *
 * [Action on GitHub](https://github.com/cachix/install-nix-action)
 *
 * @param extraNixConfig Gets appended to `/etc/nix/nix.conf` if passed.
 * @param githubAccessToken Configure nix to pull from github using the given github token.
 * @param installUrl Installation URL that will contain a script to install Nix.
 * @param installOptions Additional installer flags passed to the installer script.
 * @param nixPath Set NIX_PATH environment variable.
 * @param _customInputs Type-unsafe map where you can put any inputs that are not yet supported by
 * the binding
 * @param _customVersion Allows overriding action's version, for example to use a specific minor
 * version, or a newer version that the binding doesn't yet know about
 */
@Deprecated(
    message = "This action has a newer major version: InstallNixActionV25",
    replaceWith = ReplaceWith("InstallNixActionV25"),
)
public data class InstallNixActionV20 private constructor(
    /**
     * Gets appended to `/etc/nix/nix.conf` if passed.
     */
    public val extraNixConfig: String? = null,
    /**
     * Configure nix to pull from github using the given github token.
     */
    public val githubAccessToken: String? = null,
    /**
     * Installation URL that will contain a script to install Nix.
     */
    public val installUrl: String? = null,
    /**
     * Additional installer flags passed to the installer script.
     */
    public val installOptions: List<String>? = null,
    /**
     * Set NIX_PATH environment variable.
     */
    public val nixPath: String? = null,
    /**
     * Type-unsafe map where you can put any inputs that are not yet supported by the binding
     */
    public val _customInputs: Map<String, String> = mapOf(),
    /**
     * Allows overriding action's version, for example to use a specific minor version, or a newer
     * version that the binding doesn't yet know about
     */
    public val _customVersion: String? = null,
) : RegularAction<Action.Outputs>("cachix", "install-nix-action", _customVersion ?: "v20") {
    public constructor(
        vararg pleaseUseNamedArguments: Unit,
        extraNixConfig: String? = null,
        githubAccessToken: String? = null,
        installUrl: String? = null,
        installOptions: List<String>? = null,
        nixPath: String? = null,
        _customInputs: Map<String, String> = mapOf(),
        _customVersion: String? = null,
    ) : this(extraNixConfig=extraNixConfig, githubAccessToken=githubAccessToken,
            installUrl=installUrl, installOptions=installOptions, nixPath=nixPath,
            _customInputs=_customInputs, _customVersion=_customVersion)

    @Suppress("SpreadOperator")
    override fun toYamlArguments(): LinkedHashMap<String, String> = linkedMapOf(
        *listOfNotNull(
            extraNixConfig?.let { "extra_nix_config" to it },
            githubAccessToken?.let { "github_access_token" to it },
            installUrl?.let { "install_url" to it },
            installOptions?.let { "install_options" to it.joinToString("\n") },
            nixPath?.let { "nix_path" to it },
            *_customInputs.toList().toTypedArray(),
        ).toTypedArray()
    )

    override fun buildOutputObject(stepId: String): Action.Outputs = Outputs(stepId)
}
